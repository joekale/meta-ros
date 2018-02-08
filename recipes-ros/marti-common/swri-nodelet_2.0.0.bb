DESCRIPTION = "This package provides a simple script to write simple launch files that can easily switch between running nodelets together or as standalone nodes."
SECTION = "devel"
LICENSE = "CLOSED"

DEPENDS = "nodelet roscpp std-msgs"

PREFERRED_PROVIDER = "packagegroup-marti-common"

EXTRA_OECMAKE += "-DCATKIN_DEVEL_PREFIX=${STAGING_DIR}/${MACHINE}/${ros_prefix}"

require marti-common.inc
