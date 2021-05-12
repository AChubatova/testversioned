package Tiger01045

import Tiger01045.buildTypes.*
import Tiger01045.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01045")
    name = "Tiger01045"

    vcsRoot(Tiger01045_cVCSroot)

    buildType(Tiger01045_Hi0)
    buildType(Tiger01045_Hi1)
    buildType(Tiger01045_Hi2)
    buildType(Tiger01045_Hi3)
})
