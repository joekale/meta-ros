DESCRIPTION = "ROS messages for Geographic Information Systems."
SECTION = "devel"
LICENSE = "CLOSED"

DEPENDS = "message-generation geometry-msgs std-msgs uuid-msgs"
RDEPENDS_${PN} = "message-runtime"

require geographic-info.inc
