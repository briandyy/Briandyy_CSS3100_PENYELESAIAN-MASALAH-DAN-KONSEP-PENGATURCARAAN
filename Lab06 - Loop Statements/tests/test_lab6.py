"""Compile and check all Lab 6 programs against their exact stdout fixtures."""

import argparse
import difflib
from pathlib import Path
import subprocess
import sys
import tempfile


ROOT = Path(__file__).resolve().parents[1]
PROGRAMS = {
    "Q1": "Q1ProductSales",
    "Q2": "Q2ZooTickets",
    "Q3": "Q3BMICalculator",
    "Q4": "Q4TravelClaims",
}


def check_output(stem, expected, actual):
    if actual == expected:
        return True
    print(f"FAIL {stem}: stdout differs", file=sys.stderr)
    expected_lines = [repr(line) + "\n" for line in expected.splitlines(keepends=True)]
    actual_lines = [repr(line) + "\n" for line in actual.splitlines(keepends=True)]
    sys.stderr.writelines(difflib.unified_diff(expected_lines, actual_lines,
                                               "expected", "actual"))
    return False


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("question", nargs="?", choices=PROGRAMS)
    args = parser.parse_args()
    questions = [args.question] if args.question else list(PROGRAMS)
    passed = 0
    with tempfile.TemporaryDirectory(prefix="lab6-classes-") as classes:
        for question in questions:
            program = PROGRAMS[question]
            source = ROOT / "src" / f"{program}.java"
            compile_run = subprocess.run(
                ["javac", "-encoding", "UTF-8", "-d", classes, str(source)],
                capture_output=True, timeout=30,
            )
            if compile_run.returncode or compile_run.stderr:
                print(f"FAIL {question}: javac {source.name}", file=sys.stderr)
                sys.stderr.buffer.write(compile_run.stderr)
                continue
            for number in range(1, 4):
                stem = f"{question}-set{number}"
                inputs = (ROOT / "samples" / f"{stem}.in.txt").read_bytes()
                expected = (ROOT / "samples" / f"{stem}.out.txt").read_bytes()
                run = subprocess.run(
                    ["java", "-Duser.language=en", "-Duser.country=US", "-cp", classes, program],
                    input=inputs, capture_output=True, timeout=10,
                )
                if run.returncode or run.stderr:
                    print(f"FAIL {stem}: Java exited {run.returncode} or wrote to stderr",
                          file=sys.stderr)
                    sys.stderr.buffer.write(run.stderr)
                elif check_output(stem, expected, run.stdout):
                    print(f"PASS {stem} (exact stdout)")
                    passed += 1
    total = 3 * len(questions)
    print(f"{passed}/{total} cases passed.")
    return 0 if passed == total else 1


if __name__ == "__main__":
    sys.exit(main())
