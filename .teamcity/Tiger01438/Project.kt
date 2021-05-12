package Tiger01438

import Tiger01438.buildTypes.*
import Tiger01438.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01438")
    name = "Tiger01438"

    vcsRoot(Tiger01438_cVCSroot)

    buildType(Tiger01438_Hi3)
    buildType(Tiger01438_Hi2)
    buildType(Tiger01438_Hi1)
    buildType(Tiger01438_Hi0)
})
