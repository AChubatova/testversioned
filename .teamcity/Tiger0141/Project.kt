package Tiger0141

import Tiger0141.buildTypes.*
import Tiger0141.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0141")
    name = "Tiger0141"

    vcsRoot(Tiger0141_cVCSroot)

    buildType(Tiger0141_Hi3)
    buildType(Tiger0141_Hi1)
    buildType(Tiger0141_Hi2)
    buildType(Tiger0141_Hi0)
})
