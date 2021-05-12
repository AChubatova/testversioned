package Tiger01115

import Tiger01115.buildTypes.*
import Tiger01115.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01115")
    name = "Tiger01115"

    vcsRoot(Tiger01115_cVCSroot)

    buildType(Tiger01115_Hi0)
    buildType(Tiger01115_Hi1)
    buildType(Tiger01115_Hi2)
    buildType(Tiger01115_Hi3)
})
