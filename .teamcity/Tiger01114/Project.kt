package Tiger01114

import Tiger01114.buildTypes.*
import Tiger01114.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01114")
    name = "Tiger01114"

    vcsRoot(Tiger01114_cVCSroot)

    buildType(Tiger01114_Hi2)
    buildType(Tiger01114_Hi3)
    buildType(Tiger01114_Hi0)
    buildType(Tiger01114_Hi1)
})
