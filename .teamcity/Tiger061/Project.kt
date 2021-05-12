package Tiger061

import Tiger061.buildTypes.*
import Tiger061.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger061")
    name = "Tiger061"

    vcsRoot(Tiger061_cVCSroot)

    buildType(Tiger061_Hi1)
    buildType(Tiger061_Hi0)
    buildType(Tiger061_Hi3)
    buildType(Tiger061_Hi2)
})
