package Tiger01738

import Tiger01738.buildTypes.*
import Tiger01738.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01738")
    name = "Tiger01738"

    vcsRoot(Tiger01738_cVCSroot)

    buildType(Tiger01738_Hi1)
    buildType(Tiger01738_Hi0)
    buildType(Tiger01738_Hi3)
    buildType(Tiger01738_Hi2)
})
