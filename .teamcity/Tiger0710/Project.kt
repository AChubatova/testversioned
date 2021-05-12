package Tiger0710

import Tiger0710.buildTypes.*
import Tiger0710.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0710")
    name = "Tiger0710"

    vcsRoot(Tiger0710_cVCSroot)

    buildType(Tiger0710_Hi3)
    buildType(Tiger0710_Hi2)
    buildType(Tiger0710_Hi1)
    buildType(Tiger0710_Hi0)
})
