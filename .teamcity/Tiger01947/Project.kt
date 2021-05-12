package Tiger01947

import Tiger01947.buildTypes.*
import Tiger01947.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01947")
    name = "Tiger01947"

    vcsRoot(Tiger01947_cVCSroot)

    buildType(Tiger01947_Hi1)
    buildType(Tiger01947_Hi0)
    buildType(Tiger01947_Hi3)
    buildType(Tiger01947_Hi2)
})
