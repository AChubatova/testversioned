package Tiger0527

import Tiger0527.buildTypes.*
import Tiger0527.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0527")
    name = "Tiger0527"

    vcsRoot(Tiger0527_cVCSroot)

    buildType(Tiger0527_Hi1)
    buildType(Tiger0527_Hi2)
    buildType(Tiger0527_Hi0)
    buildType(Tiger0527_Hi3)
})
