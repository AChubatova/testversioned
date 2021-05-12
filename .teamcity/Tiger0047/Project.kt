package Tiger0047

import Tiger0047.buildTypes.*
import Tiger0047.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0047")
    name = "Tiger0047"

    vcsRoot(Tiger0047_cVCSroot)

    buildType(Tiger0047_Hi2)
    buildType(Tiger0047_Hi3)
    buildType(Tiger0047_Hi0)
    buildType(Tiger0047_Hi1)
})
