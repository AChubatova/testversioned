package Tiger069

import Tiger069.buildTypes.*
import Tiger069.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger069")
    name = "Tiger069"

    vcsRoot(Tiger069_cVCSroot)

    buildType(Tiger069_Hi2)
    buildType(Tiger069_Hi3)
    buildType(Tiger069_Hi0)
    buildType(Tiger069_Hi1)
})
