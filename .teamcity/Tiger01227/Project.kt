package Tiger01227

import Tiger01227.buildTypes.*
import Tiger01227.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01227")
    name = "Tiger01227"

    vcsRoot(Tiger01227_cVCSroot)

    buildType(Tiger01227_Hi0)
    buildType(Tiger01227_Hi3)
    buildType(Tiger01227_Hi2)
    buildType(Tiger01227_Hi1)
})
