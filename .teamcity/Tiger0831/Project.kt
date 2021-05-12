package Tiger0831

import Tiger0831.buildTypes.*
import Tiger0831.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0831")
    name = "Tiger0831"

    vcsRoot(Tiger0831_cVCSroot)

    buildType(Tiger0831_Hi3)
    buildType(Tiger0831_Hi0)
    buildType(Tiger0831_Hi2)
    buildType(Tiger0831_Hi1)
})
