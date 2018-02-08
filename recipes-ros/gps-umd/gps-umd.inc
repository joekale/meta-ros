SRC_URI = "https://github.com/swri-robotics/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SPN}.tar.gz"
SRC_URI[md5sum] = "003a1699a10b8c177868c3cc28067560"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "gps_umd"
