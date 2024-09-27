SUMMARY = "Library for remotely invoking HW accelerated codecs on IVA-HD"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://libdce.h;beginline=1;endline=31;md5=0a398cf815b8b5f31f552266cd453dae"

inherit autotools pkgconfig

DEPENDS = "libdrm ti-ipc"

SRC_URI = "git://git.ti.com/git/omapzoom/libdce.git;protocol=https;branch=master"

SRCREV = "ec14e1d5cea1ed3c3ea0e2b9cf1fd581acff93e3"

S = "${WORKDIR}/git"
EXTRA_OECONF += "IPC_HEADERS=${STAGING_INCDIR}/ti/ipc/mm"

COMPATIBLE_HOST ?= "null"
COMPATIBLE_HOST:ti-soc = "(.*)"
