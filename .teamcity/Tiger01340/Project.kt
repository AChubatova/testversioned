package Tiger01340

import Tiger01340.buildTypes.*
import Tiger01340.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01340")
    name = "Tiger01340"

    vcsRoot(Tiger01340_cVCSroot)

    buildType(Tiger01340_Hi2)
    buildType(Tiger01340_Hi1)
    buildType(Tiger01340_Hi3)
    buildType(Tiger01340_Hi0)
})
