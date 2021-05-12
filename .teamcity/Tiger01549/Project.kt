package Tiger01549

import Tiger01549.buildTypes.*
import Tiger01549.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01549")
    name = "Tiger01549"

    vcsRoot(Tiger01549_cVCSroot)

    buildType(Tiger01549_Hi0)
    buildType(Tiger01549_Hi1)
    buildType(Tiger01549_Hi2)
    buildType(Tiger01549_Hi3)
})
