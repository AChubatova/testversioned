package Tiger0220

import Tiger0220.buildTypes.*
import Tiger0220.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0220")
    name = "Tiger0220"

    vcsRoot(Tiger0220_cVCSroot)

    buildType(Tiger0220_Hi1)
    buildType(Tiger0220_Hi2)
    buildType(Tiger0220_Hi3)
    buildType(Tiger0220_Hi0)
})
