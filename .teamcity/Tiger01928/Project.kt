package Tiger01928

import Tiger01928.buildTypes.*
import Tiger01928.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01928")
    name = "Tiger01928"

    vcsRoot(Tiger01928_cVCSroot)

    buildType(Tiger01928_Hi2)
    buildType(Tiger01928_Hi1)
    buildType(Tiger01928_Hi3)
    buildType(Tiger01928_Hi0)
})
