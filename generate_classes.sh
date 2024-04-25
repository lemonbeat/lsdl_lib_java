#!/usr/bin/env bash
set -e

XSD_DIR="lsdl_xsd/xsd"
BASE_PACKAGE="com.lemonbeat.lsdl"

generate_classes() {
  for xsd_file in "$XSD_DIR"/*.xsd; do
    if [ -f "$xsd_file" ]; then
      echo "Generating Java classes for $xsd_file..."
      directory_name=$(basename "$xsd_file" .xsd)
      xjc -no-header -d src/main/java -p "$BASE_PACKAGE.$directory_name" "$xsd_file"
    fi
  done
}

generate_classes
