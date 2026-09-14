#!/usr/bin/env bash
set -e
if command -v open >/dev/null 2>&1; then
  open project.greenfoot
elif command -v xdg-open >/dev/null 2>&1; then
  xdg-open project.greenfoot
else
  echo "Open project.greenfoot from the Greenfoot application."
fi
