package Tiger01831

import Tiger01831.buildTypes.*
import Tiger01831.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01831")
    name = "Tiger01831"

    vcsRoot(Tiger01831_cVCSroot)

    buildType(Tiger01831_Hi3)
    buildType(Tiger01831_Hi2)
    buildType(Tiger01831_Hi1)
    buildType(Tiger01831_Hi0)
})
