DESCRIPTION = "marti-visualization-msgs"
SECTION = "devel"
LICENSE = "CLOSED"

DEPENDS = "message-generation sensor-msgs geometry-msgs"

RDEPENDS_${PN} = "message-runtime"

require marti-messages.inc
