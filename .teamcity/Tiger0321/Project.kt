package Tiger0321

import Tiger0321.buildTypes.*
import Tiger0321.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0321")
    name = "Tiger0321"

    vcsRoot(Tiger0321_cVCSroot)

    buildType(Tiger0321_Hi0)
    buildType(Tiger0321_Hi2)
    buildType(Tiger0321_Hi1)
    buildType(Tiger0321_Hi3)
})
