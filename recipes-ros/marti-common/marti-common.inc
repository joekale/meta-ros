SRC_URI = "https://github.com/swri-robotics/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SPN}.tar.gz"
SRC_URI[md5sum] = "7b00db16d6c903bde6a3b6a21a3cc993"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "marti_common"
