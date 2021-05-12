package Tiger0437

import Tiger0437.buildTypes.*
import Tiger0437.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0437")
    name = "Tiger0437"

    vcsRoot(Tiger0437_cVCSroot)

    buildType(Tiger0437_Hi1)
    buildType(Tiger0437_Hi2)
    buildType(Tiger0437_Hi3)
    buildType(Tiger0437_Hi0)
})
