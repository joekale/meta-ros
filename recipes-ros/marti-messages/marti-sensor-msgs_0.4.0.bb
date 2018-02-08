DESCRIPTION = "marti-sensor-msgs"
SECTION = "devel"
LICENSE = "CLOSED"

DEPENDS = "message-generation geometry-msgs"

RDEPENDS_${PN} = "message-runtime"

require marti-messages.inc
