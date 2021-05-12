package Tiger01038

import Tiger01038.buildTypes.*
import Tiger01038.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01038")
    name = "Tiger01038"

    vcsRoot(Tiger01038_cVCSroot)

    buildType(Tiger01038_Hi3)
    buildType(Tiger01038_Hi1)
    buildType(Tiger01038_Hi2)
    buildType(Tiger01038_Hi0)
})
