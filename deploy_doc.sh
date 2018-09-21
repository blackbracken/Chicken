#!/usr/bin/env bash
cd `dirname $0`

cp "build/style.css" "style.css"
cp -r "build/docs/" "docs/"