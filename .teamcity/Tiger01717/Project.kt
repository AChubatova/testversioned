package Tiger01717

import Tiger01717.buildTypes.*
import Tiger01717.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01717")
    name = "Tiger01717"

    vcsRoot(Tiger01717_cVCSroot)

    buildType(Tiger01717_Hi3)
    buildType(Tiger01717_Hi1)
    buildType(Tiger01717_Hi2)
    buildType(Tiger01717_Hi0)
})
