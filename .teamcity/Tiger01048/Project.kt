package Tiger01048

import Tiger01048.buildTypes.*
import Tiger01048.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01048")
    name = "Tiger01048"

    vcsRoot(Tiger01048_cVCSroot)

    buildType(Tiger01048_Hi3)
    buildType(Tiger01048_Hi2)
    buildType(Tiger01048_Hi1)
    buildType(Tiger01048_Hi0)
})
