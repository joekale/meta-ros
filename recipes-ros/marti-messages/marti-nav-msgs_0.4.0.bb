DESCRIPTION = "marti-nav-msgs"
SECTION = "devel"
LICENSE = "CLOSED"

DEPENDS = "message-generation std-msgs geographic-msgs geometry-msgs marti-common-msgs sensor-msgs"

RDEPENDS_${PN} = "message-runtime"

require marti-messages.inc
