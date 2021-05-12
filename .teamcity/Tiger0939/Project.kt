package Tiger0939

import Tiger0939.buildTypes.*
import Tiger0939.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0939")
    name = "Tiger0939"

    vcsRoot(Tiger0939_cVCSroot)

    buildType(Tiger0939_Hi2)
    buildType(Tiger0939_Hi3)
    buildType(Tiger0939_Hi0)
    buildType(Tiger0939_Hi1)
})
