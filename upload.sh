#!/usr/bin/env bash

#./gradlew clean :atoast:assembleRelease  :atoast:bintrayUpload
./gradlew bintrayUpload -PdryRun=false