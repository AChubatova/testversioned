package Tiger01545

import Tiger01545.buildTypes.*
import Tiger01545.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01545")
    name = "Tiger01545"

    vcsRoot(Tiger01545_cVCSroot)

    buildType(Tiger01545_Hi2)
    buildType(Tiger01545_Hi3)
    buildType(Tiger01545_Hi0)
    buildType(Tiger01545_Hi1)
})
