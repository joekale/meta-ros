SRC_URI = "https://github.com/swri-robotics/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SPN}.tar.gz"
SRC_URI[md5sum] = "c735b0944dac76fb2f32a5072d5d2c7a"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

LICENSE_PATH += "${LAYERDIR}/meta/files/common-licenses/"

inherit catkin

ROS_SPN = "marti_messages"
