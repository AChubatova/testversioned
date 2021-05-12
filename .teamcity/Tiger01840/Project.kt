package Tiger01840

import Tiger01840.buildTypes.*
import Tiger01840.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01840")
    name = "Tiger01840"

    vcsRoot(Tiger01840_cVCSroot)

    buildType(Tiger01840_Hi0)
    buildType(Tiger01840_Hi1)
    buildType(Tiger01840_Hi2)
    buildType(Tiger01840_Hi3)
})
