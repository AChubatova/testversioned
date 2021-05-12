package Tiger01211

import Tiger01211.buildTypes.*
import Tiger01211.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01211")
    name = "Tiger01211"

    vcsRoot(Tiger01211_cVCSroot)

    buildType(Tiger01211_Hi2)
    buildType(Tiger01211_Hi3)
    buildType(Tiger01211_Hi0)
    buildType(Tiger01211_Hi1)
})
