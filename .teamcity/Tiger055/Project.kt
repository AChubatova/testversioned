package Tiger055

import Tiger055.buildTypes.*
import Tiger055.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger055")
    name = "Tiger055"

    vcsRoot(Tiger055_cVCSroot)

    buildType(Tiger055_Hi3)
    buildType(Tiger055_Hi0)
    buildType(Tiger055_Hi1)
    buildType(Tiger055_Hi2)
})
