package Tiger01844

import Tiger01844.buildTypes.*
import Tiger01844.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01844")
    name = "Tiger01844"

    vcsRoot(Tiger01844_cVCSroot)

    buildType(Tiger01844_Hi0)
    buildType(Tiger01844_Hi1)
    buildType(Tiger01844_Hi2)
    buildType(Tiger01844_Hi3)
})
