package Tiger01829

import Tiger01829.buildTypes.*
import Tiger01829.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01829")
    name = "Tiger01829"

    vcsRoot(Tiger01829_cVCSroot)

    buildType(Tiger01829_Hi0)
    buildType(Tiger01829_Hi2)
    buildType(Tiger01829_Hi1)
    buildType(Tiger01829_Hi3)
})
