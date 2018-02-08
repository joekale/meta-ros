DESCRIPTION = "marti-perception-msgs"
SECTION = "devel"
LICENSE = "CLOSED"

DEPENDS = "message-generation std-msgs sensor-msgs"

RDEPENDS_${PN} = "message-runtime"

require marti-messages.inc
