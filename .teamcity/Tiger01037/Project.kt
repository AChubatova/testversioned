package Tiger01037

import Tiger01037.buildTypes.*
import Tiger01037.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01037")
    name = "Tiger01037"

    vcsRoot(Tiger01037_cVCSroot)

    buildType(Tiger01037_Hi0)
    buildType(Tiger01037_Hi1)
    buildType(Tiger01037_Hi2)
    buildType(Tiger01037_Hi3)
})
