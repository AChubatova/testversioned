package Tiger01925

import Tiger01925.buildTypes.*
import Tiger01925.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01925")
    name = "Tiger01925"

    vcsRoot(Tiger01925_cVCSroot)

    buildType(Tiger01925_Hi3)
    buildType(Tiger01925_Hi2)
    buildType(Tiger01925_Hi1)
    buildType(Tiger01925_Hi0)
})
