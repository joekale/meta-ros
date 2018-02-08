DESCRIPTION = "marti-status-msgs"
SECTION = "devel"
LICENSE = "CLOSED"

DEPENDS = "message-generation std-msgs"

RDEPENDS_${PN} = "message-runtime"

require marti-messages.inc
