package Tiger072

import Tiger072.buildTypes.*
import Tiger072.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger072")
    name = "Tiger072"

    vcsRoot(Tiger072_cVCSroot)

    buildType(Tiger072_Hi0)
    buildType(Tiger072_Hi1)
    buildType(Tiger072_Hi2)
    buildType(Tiger072_Hi3)
})
