package Tiger01715

import Tiger01715.buildTypes.*
import Tiger01715.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01715")
    name = "Tiger01715"

    vcsRoot(Tiger01715_cVCSroot)

    buildType(Tiger01715_Hi3)
    buildType(Tiger01715_Hi1)
    buildType(Tiger01715_Hi2)
    buildType(Tiger01715_Hi0)
})
