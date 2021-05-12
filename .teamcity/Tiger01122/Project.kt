package Tiger01122

import Tiger01122.buildTypes.*
import Tiger01122.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01122")
    name = "Tiger01122"

    vcsRoot(Tiger01122_cVCSroot)

    buildType(Tiger01122_Hi2)
    buildType(Tiger01122_Hi1)
    buildType(Tiger01122_Hi0)
    buildType(Tiger01122_Hi3)
})
