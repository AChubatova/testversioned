package Tiger01311

import Tiger01311.buildTypes.*
import Tiger01311.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01311")
    name = "Tiger01311"

    vcsRoot(Tiger01311_cVCSroot)

    buildType(Tiger01311_Hi1)
    buildType(Tiger01311_Hi2)
    buildType(Tiger01311_Hi3)
    buildType(Tiger01311_Hi0)
})
