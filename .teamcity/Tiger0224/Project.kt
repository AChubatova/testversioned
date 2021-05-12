package Tiger0224

import Tiger0224.buildTypes.*
import Tiger0224.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0224")
    name = "Tiger0224"

    vcsRoot(Tiger0224_cVCSroot)

    buildType(Tiger0224_Hi2)
    buildType(Tiger0224_Hi1)
    buildType(Tiger0224_Hi3)
    buildType(Tiger0224_Hi0)
})
